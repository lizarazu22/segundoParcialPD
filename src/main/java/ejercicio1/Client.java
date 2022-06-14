package ejercicio1;

public class Client {
    public static void main(String[] args) {
        SaveDocumentCareTaker caretaker = new SaveDocumentCareTaker();
        StorageOriginator originator = new StorageOriginator();

        Document softwareProyect;

        softwareProyect = new Document("SCRUM Master investigation",1);
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (Document) softwareProyect.clone();
        softwareProyect.setVersion(2);
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (Document) softwareProyect.clone();
        softwareProyect.setVersion(3);
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (Document) softwareProyect.clone();
        softwareProyect.setVersion(4);
        originator.setCommit(softwareProyect);

        caretaker.addMemento(originator.createCommit());


        originator.retoreTheDocument(caretaker.ctrlz());
        originator.retoreTheDocument(caretaker.ctrlz());
        originator.retoreTheDocument(caretaker.ctrlz());

        originator.retoreTheDocument(caretaker.ctrly());
        originator.retoreTheDocument(caretaker.ctrly());
        originator.retoreTheDocument(caretaker.ctrly());

    }
}
