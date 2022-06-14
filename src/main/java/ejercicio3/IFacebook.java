package ejercicio3;

public interface IFacebook {
    void attach(IUser observer);
    void deattach(IUser observer);
    void notifyObserver(Post post);
}
