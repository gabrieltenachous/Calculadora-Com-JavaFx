package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class CalculadoraContolador {
	@FXML
	private TextField txtExpressao;
	@FXML
	private Button btNumero1;
	@FXML
	private Button btNumero2;
	@FXML
	private Button btNumero3;
	@FXML
	private Button btNumero4;
	@FXML
	private Button btNumero5;
	@FXML
	private Button btNumero6;
	@FXML
	private Button btNumero7;
	@FXML
	private Button btNumero8;
	@FXML
	private Button btNumero9;
	@FXML
	private Button btNumero0;
	@FXML
	private Button btVirgula;
	@FXML
	private Button btDivisao;
	@FXML
	private Button btIgual;
	@FXML
	private Button btVezes;
	@FXML
	private Button btMenos;
	@FXML
	private Button btMais;
	@FXML
	private Button btDeletar;
	@FXML
	private Button btDeletarTudo;
	@FXML
	private RadioButton rbOn;
	@FXML
	private RadioButton rbOff;
	@FXML
	private Label lbExpressao;

	private double numero, ans;
	private int calculadora;

	 
	public void operacao_aritimetica() {
		switch (calculadora) {
		case 1: //soma
			ans = numero + Double.parseDouble(txtExpressao.getText());
			txtExpressao.setText(Double.toString(ans));
			break;
			
		case 2: // subtracao
			ans = numero - Double.parseDouble(txtExpressao.getText());
			txtExpressao.setText(Double.toString(ans));
			break;
			
		case 3: // mutltiplicacao
			ans = numero * Double.parseDouble(txtExpressao.getText());
			txtExpressao.setText(Double.toString(ans));
			break;
			
		case 4: // divisao
			ans = numero / Double.parseDouble(txtExpressao.getText());
			txtExpressao.setText(Double.toString(ans));
			break;
		}
	}

	public void ligadoDesligado(boolean btOffOnn) {

		btDeletar.setDisable(btOffOnn);
		btDeletarTudo.setDisable(btOffOnn);
		btNumero0.setDisable(btOffOnn);
		btNumero1.setDisable(btOffOnn);
		btNumero2.setDisable(btOffOnn);
		btNumero3.setDisable(btOffOnn);
		btNumero4.setDisable(btOffOnn);
		btNumero5.setDisable(btOffOnn);
		btNumero6.setDisable(btOffOnn);
		btNumero7.setDisable(btOffOnn);
		btNumero8.setDisable(btOffOnn);
		btNumero9.setDisable(btOffOnn);
		btDivisao.setDisable(btOffOnn);
		btIgual.setDisable(btOffOnn);
		btMais.setDisable(btOffOnn);
		btVezes.setDisable(btOffOnn);
		btVirgula.setDisable(btOffOnn);
		btMenos.setDisable(btOffOnn);
	}

	public void rbBtOn() {
		ligadoDesligado(false);
	}

	public void rbBtOff() {
		ligadoDesligado(true);
	}

	public void onBtVirgula() {

		txtExpressao.setText(txtExpressao.getText() + ".");
	}

	public void onBtDivisao() {
		numero = Double.parseDouble(txtExpressao.getText());
		calculadora = 4 ;
		txtExpressao.setText("");
		lbExpressao.setText(numero+"/");
	}

	public void onBtIgual() { 
		operacao_aritimetica();
		lbExpressao.setText("");
	}

	public void onBtVezes() {
		numero = Double.parseDouble(txtExpressao.getText());
		calculadora = 3;
		txtExpressao.setText("");
		lbExpressao.setText(numero+"*");
	}

	public void onBtMenos() {
		numero = Double.parseDouble(txtExpressao.getText());
		calculadora = 2;
		txtExpressao.setText("");
		lbExpressao.setText(numero+"-");
	}

	public void onBtMais() {
		numero = Double.parseDouble(txtExpressao.getText());
		calculadora = 1;
		txtExpressao.setText("");
		lbExpressao.setText(numero+":");
	}

	public void onBtApagarTudo() {
		txtExpressao.setText("");
		lbExpressao.setText("");
	}

	public void onBtApagar() {
		int tamanho = txtExpressao.getText().length();
		int numero = txtExpressao.getText().length() - 1;
		String novaExpressao;
		if (tamanho > 0) {
			StringBuilder voltar = new StringBuilder(txtExpressao.getText());
			voltar.deleteCharAt(numero);
			novaExpressao = voltar.toString();
			txtExpressao.setText(novaExpressao);
		}

	}

	public void onBtNumero1() {
		txtExpressao.setText(txtExpressao.getText() + "1");
	}

	public void onBtNumero2() {
		txtExpressao.setText(txtExpressao.getText() + "2");
	}

	public void onBtNumero3() {
		txtExpressao.setText(txtExpressao.getText() + "3");
	}

	public void onBtNumero4() {
		txtExpressao.setText(txtExpressao.getText() + "4");
	}

	public void onBtNumero5() {
		txtExpressao.setText(txtExpressao.getText() + "5");
	}

	public void onBtNumero6() {
		txtExpressao.setText(txtExpressao.getText() + "6");
	}

	public void onBtNumero7() {
		txtExpressao.setText(txtExpressao.getText() + "7");
	}

	public void onBtNumero8() {
		txtExpressao.setText(txtExpressao.getText() + "8");
	}

	public void onBtNumero9() {
		txtExpressao.setText(txtExpressao.getText() + "9");
	}

	public void onBtNumero0() {
		txtExpressao.setText(txtExpressao.getText() + "0");
	}
}
