#!/bin/bash

#the below is  to copy the files from the server
#scp root@164.92.217.119:/root/openroberta-lab/demo.py /home/husarion/husarion_ws/src/husarion_ros/scripts

if rsync --remove-source-files root@164.92.217.119:/root/file-saver/downloads/YOURprog_194773.py /home/husarion/husarion_ws/src/husarion_ros/scripts; then

cd ~/husarion_ws/src/husarion_ros/scripts

chmod +x YOURprog_194773.py

python YOURprog_194773.py

else
  echo "no program available"
fi
