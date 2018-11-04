import serial
ser = serial.Serial('/dev/tty96B0', 9600)
while True:
    print(ser.readline())
print("finished")
