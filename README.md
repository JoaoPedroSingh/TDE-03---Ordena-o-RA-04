Após a implementação dos algoritmos Quick Sort e Gnome Sort em Java, foram realizados testes sistemáticos sobre vetores de inteiros com tamanhos variados: 1.000, 10.000, 100.000, 500.000 e 1.000.000 elementos. Para garantir diversidade e reprodutibilidade nos dados, cada experimento foi repetido cinco vezes com diferentes sementes aleatórias.

O objetivo foi avaliar e comparar o comportamento dos algoritmos com base em três métricas principais: tempo de execução, número de trocas e número de iterações, possibilitando uma análise aprofundada de sua eficiência relativa e adequação a diferentes cenários de uso.

🔎 O que foi notado e comprovado:

📈 1. Tempo de Execução.
Foi rapidamente observado que o Quick Sort superou o Gnome Sort de forma consistente em todos os tamanhos de vetor testados. O Quick Sort manteve um tempo de execução muito baixo mesmo com vetores de 1 milhão de elementos, completando a ordenação em milissegundos a poucos segundos. Já o Gnome Sort, embora funcional para vetores pequenos, tornou-se impraticável a partir de 100.000 elementos, chegando a levar minutos ou até falhar por limitação de recursos em entradas maiores.

Essa disparidade confirma a teoria das complexidades assintóticas:

Quick Sort tem desempenho médio de O(n log n).

Gnome Sort possui complexidade O(n²), o que se reflete diretamente na sua escalabilidade limitada.

🔁 2. Número de Trocas.
Outra diferença marcante está no número de trocas realizadas:

O Quick Sort, por usar uma estratégia de divisão por pivôs, realiza trocas apenas quando necessário, de forma localizada. Isso mantém o número de operações baixo e previsível.

O Gnome Sort, por outro lado, é baseado em repetidas correções locais. Assim, ao encontrar um erro, ele retrocede e refaz múltiplas comparações e trocas, o que aumenta exponencialmente o número de movimentos, mesmo em vetores com pouca desordem.

Nos testes, o Gnome Sort chegou a fazer centenas de vezes mais trocas do que o Quick Sort no mesmo conjunto de dados.

🔄 3. Número de Iterações.
O comportamento interno dos algoritmos também se revelou muito distinto quando observamos o número de iterações (ou comparações):

O Quick Sort utiliza chamadas recursivas e não precisa percorrer o vetor inteiro repetidamente. Assim, ele minimiza o número total de iterações, o que melhora a performance em vetores grandes.

O Gnome Sort, por sua estrutura linear corretiva, realiza múltiplas passagens pelos mesmos elementos, resultando em uma quantidade excessiva de iterações conforme o tamanho da entrada aumenta.

Essa característica torna o Gnome Sort um algoritmo ineficiente não apenas em tempo, mas também em consumo de CPU e instruções executadas.

📊 Comparação em Diferentes Tamanhos de Arquivos

A análise por tamanho de vetor mostra claramente a diferença de escalabilidade:

Até 1.000 elementos: Ambos funcionam bem, embora o Quick Sort já seja visivelmente mais rápido.

Em 10.000 elementos: O Gnome Sort já demonstra lentidão considerável. O Quick Sort mantém desempenho excelente.

A partir de 100.000 elementos: O Gnome Sort torna-se inviável para uso prático, com tempos de execução que crescem de forma quase exponencial. O Quick Sort permanece eficiente.

Em 500.000 a 1.000.000 elementos: O Gnome Sort não é mais aplicável em contextos reais. O Quick Sort segue executando de maneira confiável e rápida.

✅ Conclusão

Com base nos resultados experimentais e nas análises realizadas, podemos afirmar com segurança que:

O Quick Sort é amplamente superior em todos os aspectos mensuráveis: tempo de execução, número de trocas e número de iterações.

O Gnome Sort, embora funcional e estável, é limitado a fins didáticos ou conjuntos extremamente pequenos. Sua performance degrada rapidamente em cenários práticos.
