package com.tempus.administracaodecliente.thymeleaf;

import java.util.HashSet;
import java.util.Set;

import org.thymeleaf.dialect.AbstractProcessorDialect;
import org.thymeleaf.processor.IProcessor;
import org.thymeleaf.standard.StandardDialect;

import com.tempus.administracaodecliente.thymeleaf.processor.ClassForErrorAttributeTagProcessor;
import com.tempus.administracaodecliente.thymeleaf.processor.MenuAttributeTagProcessor;
import com.tempus.administracaodecliente.thymeleaf.processor.MessageElementTagProcessor;
import com.tempus.administracaodecliente.thymeleaf.processor.OrderElementTagProcessor;
import com.tempus.administracaodecliente.thymeleaf.processor.PaginationElementTagProcessor;


public class TempusDialect extends AbstractProcessorDialect{

	public TempusDialect() {
		super("Tempus AdministracaoClientes", "tempus", StandardDialect.PROCESSOR_PRECEDENCE);
	}
	
	@Override
	public Set<IProcessor> getProcessors(String dialectPrefix) {
		final Set<IProcessor> processadores = new HashSet<>();
		processadores.add(new ClassForErrorAttributeTagProcessor(dialectPrefix));
		processadores.add(new MessageElementTagProcessor(dialectPrefix));
		processadores.add(new OrderElementTagProcessor(dialectPrefix));
		processadores.add(new PaginationElementTagProcessor(dialectPrefix));
		processadores.add(new MenuAttributeTagProcessor(dialectPrefix));
		return processadores;
	}

}
