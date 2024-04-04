#!/bin/sh

ver=$(head -n 1 ./versionApp.properties | cut -d '=' -f 2)
echo "versionCode=$(($ver + 1))" > ./versionApp.properties
echo "versionName=$1" >> ./versionApp.properties