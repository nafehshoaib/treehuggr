#!/usr/bin/env python

import time
import grovepi

while True:
    try:
        print(grovepi.acc_xyz())
        time.sleep(.5)
                        
    except IOError:
        print("err")
