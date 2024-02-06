### Chat Application Overview

The Chat Application consists of two main components: the client and the server. The client is responsible for sending messages, and the server handles receiving and broadcasting these messages to other connected clients.

### Prerequisites

- **Java Development Kit (JDK):** Ensure that you have JDK installed on your system. You can download it from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.

### Setting Up the Server

1. Open a terminal or command prompt.
2. Navigate to the directory containing the server files.
3. Compile the server code:
   ```bash
   javac Server.java
   ```
4. Run the server:
   ```bash
   java Server
   ```
   The server will start and wait for incoming client connections.

### Setting Up the Client

1. Open a new terminal or command prompt.
2. Navigate to the directory containing the client files.
3. Compile the client code:
   ```bash
   javac Client.java
   ```
4. Run the client:
   ```bash
   java Client
   ```
   The client application window will appear.

### Using the Chat Application

1. The client application window will display a chat interface with a text input field at the bottom.
2. Enter your message in the text field.
3. Click the "Send" button to send the message.
4. The messages will be displayed in the chat window, including a timestamp.

### Important Notes

- **Server Initialization:** The server needs to be started before any clients connect. Ensure that the server is running when launching the client application.

- **Server Address:** The client is configured to connect to the server at the address "127.0.0.1" (localhost) on port 6001. If the server is running on a different machine, modify the server address in the client code accordingly.

- **Icons:** The client application uses image icons located in the "icons" directory. Ensure that the "icons" directory is present in the same directory as the client Java file.

### Exiting the Application

- Click the close button on the client application window to exit the program. This will close the client connection to the server.

### Troubleshooting

- If there are issues with connectivity, ensure that there are no firewall restrictions preventing communication on the specified port.

### Disclaimer

This Chat Application is a simple demonstration and may not be suitable for production use. It lacks security features and error handling mechanisms commonly found in robust chat applications.
