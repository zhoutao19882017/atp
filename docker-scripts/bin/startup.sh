#!/usr/bin/env bash

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd ${DIR}

echo '=====开始安装中间件环境====='

echo '=====开始运行 mysql ====='
docker-compose --compatibility -f ../atp/mysql.yml up -d
echo '===== mysql 正在进行初始化,请等待...====='
./wait-for-it.sh localhost:3306 --timeout=60 -- echo "===== mysql 已经准备就绪====="

echo '=============================================='
echo '=====【中间件已经安装完毕】====='
echo '=============================================='
