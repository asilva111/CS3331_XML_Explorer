/**/
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
public class Reader {
	
	public static void printElement(Node nNode) {//Method that prints a given node's elements.
//		int index = 1;
//		
//		Node nNode = nList.item(index); //Access linked list (nList) and return node at index 'temp'.
		Element eElement = (Element) nNode;
		NodeList nodeList = eElement.getChildNodes();
		System.out.println("~~~~~~~~~~~~~~~");
		System.out.print(eElement.getTagName() + ": ");

		for(int i = 1; i < nodeList.getLength(); i+=2){ //Skip the root by starting at 1.
				
			if (nNode.getNodeType() == Node.ELEMENT_NODE){

				//Print the name of the tag of the current node + the contents of the node with said name.
				System.out.print(nodeList.item(i).getNodeName()  + " = " 
				+ eElement.getElementsByTagName(nodeList.item(i).getNodeName() ).item(0).getTextContent() + " | ");
				
			}

		}
		
	}


	public static void main(String[] args){
		int index = 1;
		
		try {
			File inputFile = new File("input.txt"); //Read file
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("*");//Creates linked list of all elements with tag "String".
			System.out.println("nList length: " + nList.getLength());
			
			System.out.println("----------------------------");
			

			Node nNode = nList.item(index); //Access linked list (nList) and return node at index 'temp'.

			printElement(nNode);
			
			

			

			
			
			
			
			
			
			
//			for (int temp = 1; temp < nList.getLength(); temp++) {  //Traverse Linked List using 'temp' as index, skip the root by starting at 1.

//			}//Close for
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//Close Try
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

