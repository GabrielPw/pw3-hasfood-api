package br.com.gabriel.xavier.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_AVALIACAO")
public class Avaliacao {
	
	@Id
    @Column(name="ID_AVALIACAO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name="TX_COMENTARIO")
	String comentario;
	
	@Column(name="NR_NOTA")
	Integer nota;
	
	@ManyToOne
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;
}
