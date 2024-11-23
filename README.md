   <h1>Sistema de Funcionários e Gerentes</h1>
   <p>Este projeto em Java é um sistema simples que demonstra conceitos fundamentais de Programação Orientada a Objetos (POO). Ele utiliza uma hierarquia de classes para modelar funcionários genéricos e gerentes, explorando herança, encapsulamento e polimorfismo. A classe Funcionario serve como base, enquanto a classe Gerente estende a funcionalidade da primeira, adicionando um atributo adicional (bonus) e sobrescrevendo métodos para personalizar o comportamento. A classe Main funciona como o ponto de entrada, criando e exibindo os objetos, além de calcular seus salários totais. O projeto é ideal para iniciantes em Java que desejam aprender e praticar os conceitos essenciais de POO de forma prática e aplicada.</p>
    <section>
        <h2>Objetivo</h2>
        <p>
            Este projeto demonstra conceitos de Programação Orientada a Objetos (POO), como:
        </p>
        <ul>
            <li><strong>Encapsulamento:</strong> Uso de métodos <code>get</code> e <code>set</code> para manipular atributos privados.</li>
            <li><strong>Herança:</strong> Classe <code>Gerente</code> estende a funcionalidade da classe <code>Funcionario</code>.</li>
            <li><strong>Polimorfismo:</strong> Sobrescrita do método <code>calcularSalarioTotal</code> para comportamentos específicos.</li>
        </ul>
    </section>
    <section>
        <h2>Estrutura do Projeto</h2>
        <h3>1. Classe <code>Funcionario</code></h3>
        <p>
            Representa um funcionário genérico, com os seguintes elementos:
        </p>
        <ul>
            <li>Atributo privado <code>salario</code>.</li>
            <li>Métodos <code>get</code> e <code>set</code> para acessar e alterar o salário.</li>
            <li>Método <code>calcularSalarioTotal</code>, que retorna o salário base.</li>
            <li>Método sobrescrito <code>toString</code>, exibindo os detalhes do funcionário.</li>
        </ul>
        <h3>2. Classe <code>Gerente</code></h3>
        <p>
            Subclasse de <code>Funcionario</code>, com as seguintes características adicionais:
        </p>
        <ul>
            <li>Atributo <code>bonus</code> para gerentes.</li>
            <li>Sobrescrita do método <code>calcularSalarioTotal</code>, incluindo o bônus no cálculo.</li>
            <li>Método sobrescrito <code>toString</code>, exibindo informações completas.</li>
        </ul>
        <h3>3. Classe <code>Main</code></h3>
        <p>
            Ponto de entrada do programa, responsável por:
        </p>
        <ul>
            <li>Criar objetos das classes <code>Funcionario</code> e <code>Gerente</code>.</li>
            <li>Exibir informações detalhadas dos objetos.</li>
            <li>Calcular e exibir o salário total de cada um.</li>
        </ul>
    </section>
    <section>
        <h2>Saída Esperada</h2>
        <p>
            O programa exibe informações detalhadas dos objetos criados e seus salários totais.
        </p>
    </section>
    <section>
        <h2>Contribuição</h2>
        <p>
            Contribuições são bem-vindas! Abra issues ou envie pull requests para melhorias no projeto.
        </p>
    </section>
