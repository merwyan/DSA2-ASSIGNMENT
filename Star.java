import java.util.ArrayList;
import java.util.List;

public class Star {
    private ServerNode serverNode;
    private List<ClientNode> clientNodes;

    public Star() {
        serverNode = new ServerNode();
        clientNodes = new ArrayList<>();
    }

    public List<ClientNode> getClientNodes() {
        return clientNodes;
    }

    public void insertNode(String clientName) {
        ClientNode newClient = new ClientNode(clientName, this);
        clientNodes.add(newClient);
        serverNode.registerClient(newClient);
        System.out.println("Client " + clientName + " has been added to the network.");
    }

    public void deleteNode(String clientName) {
        ClientNode clientToRemove = null;
        for (ClientNode client : clientNodes) {
            if (client.getName().equals(clientName)) {
                clientToRemove = client;
                break;
            }
        }

        if (clientToRemove != null) {
            clientNodes.remove(clientToRemove);
            serverNode.removeClient(clientToRemove);
            System.out.println("Client " + clientName + " has been removed from the network.");
        } else {
            System.out.println("Client " + clientName + " not found in the network.");
        }
    }

    public void sendMessage(String senderName, String receiverName, String message) {
        ClientNode sender = null;
        ClientNode receiver = null;

        for (ClientNode client : clientNodes) {
            if (client.getName().equals(senderName)) {
                sender = client;
            } else if (client.getName().equals(receiverName)) {
                receiver = client;
            }
        }

        if (sender != null && receiver != null) {
            sender.send(serverNode, receiver, message);
        } else {
            System.out.println("Sender or receiver not found in the network.");
        }
    }
}