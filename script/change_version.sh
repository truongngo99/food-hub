#!/bin/sh

ver=$(head -n 1 ./versionApp.properties | cut -d '=' -f 2)
nextCode=$(git rev-list @ --count)
echo "versionCode=${nextCode}" > ./versionApp.properties