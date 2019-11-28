/*
 * Copyright 2019 Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Josefina Pugliese Vazquez - josefinamilagros.pugliese.alum@iescamp.es
 */
public final class App {

    //Datos
    public static final int N1;
    public static final int N2;

    static {
        //Activar random
        final Random RND = new Random();

        //Minimos y máximos
        final int MIN = 1;
        final int MAX = 10;

        //Calculo n1 y n1 random
        N1 = RND.nextInt(MAX - MIN + 1) + MIN;
        N2 = RND.nextInt(MAX - MIN + 1) + MIN;
    }

    public final void launchApp() {
        //Cabecera
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");

        //Salido números
        System.out.printf("Número 1 ....: %d%n", N1);
        System.out.printf("Número 2 ....: %d%n", N2);

        //Separador
        System.out.println("---");

        //Calculo pantalla
        System.out.printf("El MAYOR es .: %d%n", (int) UtilesPrimitivos.operar(N1, N2, UtilesPrimitivos.OP_MAY));
    }

}
