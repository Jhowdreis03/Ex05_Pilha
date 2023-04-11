Pilha pilha = new Pilha();
// adicionar elementos na pilha

Fila filaPares = new Fila();
Fila filaImpares = new Fila();

while (!pilha.isEmpty()) {
    int elemento = pilha.pop();
    if (elemento % 2 == 0) {
        filaPares.insert(elemento);
    } else {
        filaImpares.insert(elemento);
    }
}

System.out.println("Elementos pares: " + filaPares.list());
System.out.println("Elementos ímpares: " + filaImpares.list());
