#!/usr/bin/python
from geometry_msgs.msg import Twist
from sensor_msgs.msg import LaserScan
import rospy
import math
import time
pub = rospy.Publisher('/cmd_vel', Twist, queue_size=1)


def run(lin_speed, lin_duration):
 move = Twist()
 move.linear.x = lin_speed * 0.01
 for i in range(lin_duration):
    pub.publish(move)
    rospy.sleep(0.1)

def turn(ang_speed, ang_duration):
 rotate = Twist()
 rotate.angular.z = ang_speed * 0.01
 for i in range(ang_duration):
    pub.publish(rotate)
    rospy.sleep(0.1)

def stop():
 rate = rospy.Rate(10) # 10Hz
 twist = Twist()
 start = time.time()
 flag=True #time flag

 twist.linear.z = 0.00
 twist.linear.y = 0.00
 twist.linear.x = 0.00

 while not rospy.is_shutdown() and flag:
     sample_time=time.time()
     if ((sample_time - start) > 2):
       flag=False
     pub.publish(twist)
 twist = Twist()
 pub.publish(twist)
 rate.sleep()


def obs_avoid(msg):

  if msg.ranges[0] > 1:
     move.linear.x = 0.5
     move.angular.z = 0.0
  else:
    move.linear.x = 0.0
    move.angular.z = 0.5   
    if msg.ranges[0] > 1:
        move.linear.x = 0.5
        move.angular.z = 0.0

  pub.publish(move)

  sub = rospy.Subscriber('scan', LaserScan, obs_avoid)
  for i in range(60):
   pub.publish(move)
   rospy.sleep(0.1)  
