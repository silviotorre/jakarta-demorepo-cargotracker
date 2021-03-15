package org.eclipse.cargotracker.infrastructure.events.cdi;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier; //javax import fa parte delle librerie java ee (ora namespace jakartaee)

/*
Sulle annotazioni qui sotto:
Queste rispecchiano lo standard Java Specification Requests 330 (o JSR 330)
In spring si utilizza molto @autowired rispetto @inject (disponibile solo dalla ver. 2.5 in poi di spring)
Ciò rende non interoperabile questo codice con spring se non con modifiche
*/

@Qualifier// serve a 'qualificare' un bean in vista della dependency injection
@Retention(RUNTIME)
@Target({FIELD, PARAMETER})
public @interface CargoInspected {}
