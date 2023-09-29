package apps;
public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		System.out.println("Enviando mensagem pelo MSN  ");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN  ");
	} 
	public void salvarHistoricoMensagem() {
		System.out.println("Mensagem salva em histórico...");
	}
}