package listaEnlazadaSimple;

public class SinglyLinkedList {
	public Node head;
	public Node newNode;
	public int temporal;
    public SinglyLinkedList() {

       this.head = null; 
       this.newNode = null;
       this.temporal = 4;

    }

    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.

    public void add(int value) {

        newNode = new Node(value);

        if(head == null) {

            head = newNode;

        } else {

            Node runner = head;

            while(runner.next != null) {

                runner = runner.next;

            }

            runner.next = newNode;
            

        }      


    }
    
	public int remove() {

		int elemento = head.value;
		if (newNode == head) {
			newNode = head = null;
		} else {
			Node temporal = newNode;
			while (temporal.next != head) {
				temporal = temporal.next;
			}
			head = temporal;
			head.next = null;
		}
		return elemento;
	}


	 

	public void printValues() {
		
		Node recorrer = newNode;
		while(recorrer!=null) {
			System.out.println("["+recorrer.value+"]--->");
			recorrer = recorrer.next;
		}
	}    
}
