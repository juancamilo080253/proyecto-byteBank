public class Main {

    public static void main(String[] args) {

        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.saldo=1000;
        System.out.println(primeraCuenta.saldo);
        primeraCuenta.depositar(200.00);
        System.out.println(primeraCuenta.saldo);

        primeraCuenta.retirar(1000);
        System.out.println("Saldo disponible " + primeraCuenta.saldo);

        Cuenta cuentaDeJimena =new Cuenta();
        cuentaDeJimena.depositar(3000);
        cuentaDeJimena.transferir(1400,primeraCuenta);

        Cliente diego = new Cliente();
        diego.nombre="Diego";
        diego.documento="44522254";
        diego.telefono="88889999";

        Cuenta cuentaDeDiego= new Cuenta();
        cuentaDeDiego.agencia=1;
        cuentaDeDiego.titular=diego;

        System.out.println(cuentaDeDiego.titular.documento);

    }
}