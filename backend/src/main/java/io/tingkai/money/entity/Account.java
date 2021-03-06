package io.tingkai.money.entity;

import java.math.BigDecimal;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.tingkai.money.constant.DatabaseConstants;
import lombok.Data;

/**
 * Entity for sql database table 'account'
 * 
 * @author tingkai
 */
@Entity
@Data
@Table(name = DatabaseConstants.TABLE_ACCOUNT)
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String ownerName;
	private String currency;
	private BigDecimal balance;
}
