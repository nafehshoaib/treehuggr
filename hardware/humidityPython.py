import mraa
print("Mraa version: ")
print(mraa.getVersion())

data = mraa.Gpio(23)
data.dir(mraa.DIR_IN)

while True:
    print(data.read())
