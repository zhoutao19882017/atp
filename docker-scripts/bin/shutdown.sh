#!/usr/bin/env bash

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd ${DIR}

echo '=====开始关闭中间件环境====='

echo '=====开始关闭 mysql ====='
docker-compose --compatibility -f ../atp/mysql.yml down
echo '===== mysql 正在进行初始化,请等待...====='

echo '=============================================='
echo '=====【中间件已经成功结束】====='
echo '=============================================='
