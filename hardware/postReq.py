#!/usr/bin/python 
import serial 
import requests
ser = serial.Serial('/dev/tty96B0', 9600)
API_ENDPOINT = "https://mediquix.lib.id/treehuggrmaps@dev"

#source_code = ser.readline()
source_code = "testing this"
print("read line from serial: ", source_code)
data = {'data':source_code, 'lat':32, 'long':35}
r = requests.post(url = API_ENDPOINT, data = data)
pastebin_url = r.text
print("url is: ", pastebin_url)
