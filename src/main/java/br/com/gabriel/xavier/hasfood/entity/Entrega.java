package br.com.gabriel.xavier.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_ENTREGA")
public class Entrega {

	@Id
    @Column(name="ID_ENTREGA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name="TX_NOME_CLIENTE")
	String nome_cliente;
	
	@Column(name="TX_ENDERECO")
	String endereco;
	
	@ManyToOne
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;
}
