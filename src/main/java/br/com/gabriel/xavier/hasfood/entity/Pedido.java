package br.com.gabriel.xavier.hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.gabriel.xavier.hasfood.enums.StatusPedidoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_PEDIDO")
public class Pedido {
	
	@Id
    @Column(name="ID_PEDIDO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name="DT_PEDIDO")
	LocalDate dt_pedido;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TX_STATUS")
	StatusPedidoEnum tx_status;
	
	@Column(name="ID_RESTAURANTE")
	Long id_restaurante;
}
