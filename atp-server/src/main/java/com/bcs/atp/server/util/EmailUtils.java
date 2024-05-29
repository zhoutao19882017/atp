package com.bcs.atp.server.util;

import com.soulcraft.utils.email.bean.EmailInfo;
import com.soulcraft.utils.email.exception.MailSendException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.util.regex.Pattern;

/**
 * 电子邮件工具类
 *
 * @author scott
 * @since 2024/04/02
 */
@Component
@Slf4j
public class EmailUtils {
  @Autowired
  private EmailSenderUtils emailSenderUtils;

  @Value("${email.validatePattern}")
  private String emailPattern;
  @Value("${infra.auth.loginLinkPrefix}")
  private String loginLinkPrefix;
  @Value("${email.templates.userInvitation.fileName}")
  private String userInvitationFileName;
  @Value("${email.templates.userInvitation.subject}")
  private String userInvitationSubject;
  @Autowired
  private SpringTemplateEngine templateEngine;

  /**
   * 检验email格式是否符合要求
   *
   * @param email 邮件地址
   * @return email格式是否符合要求
   */
  public boolean validateEmail(String email) {
    Pattern pattern = Pattern.compile(emailPattern);
    return pattern.matcher(email).matches();
  }

  /**
   * 发送登录/注册邮件
   *
   * @param email 邮件收件人
   * @param token 登录令牌
   * @throws MailSendException 发送邮件失败
   */
  public void sendUserInvitationEmail(String email, String token) throws MailSendException {
    log.info("email link is {}{}", loginLinkPrefix, token);
    EmailInfo emailInfo = new EmailInfo();
    emailInfo.setSubject(userInvitationSubject);
    emailInfo.setReceivers(email);
    String content = getUserInvitationEmailContent(email, token);
    emailInfo.setHtmlContent(content);
    emailSenderUtils.sendEmail(emailInfo);
  }

  private String getUserInvitationEmailContent(String email, String token) {
    Context ctx = new Context();
    String magicLink = String.format("%s%s", loginLinkPrefix, token);
    ctx.setVariable("magicLink", magicLink);
    ctx.setVariable("inviteeEmail", email);
    return templateEngine.process(userInvitationFileName, ctx);
  }

}
