import io.grpc.stub.StreamObserver;
import br.ufu.facom.gbc074.project.AdminPortalGrpc;
import br.ufu.facom.gbc074.project.Client;
import br.ufu.facom.gbc074.project.Reply;
import br.ufu.facom.gbc074.project.ID;

public class AdminPortalImpl extends AdminPortalGrpc.AdminPortalImplBase {

  @Override
  public void createClient(Client request, StreamObserver<Reply> responseObserver) {
    // Implementação do método createClient aqui
    Reply reply = Reply.newBuilder()
      .setError(0)
      .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void retrieveClient(ID request, StreamObserver<Client> responseObserver) {
    // Implementação do método retrieveClient aqui
    Client client = Client.newBuilder()
      .setCID("1234")
      .setData("{\"name\": \"John Doe\"}")
      .build();
    responseObserver.onNext(client);
    responseObserver.onCompleted();
  }

  @Override
  public void updateClient(Client request, StreamObserver<Reply> responseObserver) {
    // Implementação do método updateClient aqui
    Reply reply = Reply.newBuilder()
      .setError(0)
      .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteClient(ID request, StreamObserver<Reply> responseObserver) {
    // Implementação do método deleteClient aqui
    Reply reply = Reply.newBuilder()
      .setError(0)
      .build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
