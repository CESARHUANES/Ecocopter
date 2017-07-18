/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printerFarma;

//import printerFarma.FarmaPrinterFacade;

import printerFarma.FarmaPrinterFacade;


/**
 *
 * @author desarrollo2
 */
public class ImprimeTicket {
  String emisor="BOTICAS MI FARMA";
String razonSocial="MIFARMA S.A.C";
String lima=",Lima";
String rucemisor="RUC:20305354563";
String direccion="Cal v.Alzamora 147 Urb Sta Catalina,La Victoria,Lima";
String telefono="Telf: 2130760";
String direcLocal="T506 AV. JAVIER PRADO ESTE NRO.156 LIMA LIMA LA VICTORIA";
String nomDocElec="FACTURA-ELECTRONICA";
String numDocElec="F001-00000001";
String fecEmision="Fecha emision:01/07/2014  18:12:59";
String ordeCompra="O/C-000000001";
String numGuiaRemision="G/R:0001-000000001";
String detalle="Codigo"+"  \t"+"Descripcion"+"         \t"+"Cant."+"  \t"+"P.U"+"   \t"+"Importe";
String gravadas="OP.GRAVADAS";
String inafectas="OP.INAFECTAS";
String exoneradas="OP.EXONERADAS";
String gratuitas="OP.GRATUITAS";
String igv="IGV-18%";
String descuento="DESCUENTO";
String total="TOTAL";
String totalpagar="TOTAL A PAGAR";
String efecSoles="EFECTIVO SOLES";
String vuelto="VUELTO";
String rucCliente="RUC CLIENTE:2041955020";
String razSocial="RAZON SOCIAL:RIMAC S.A";
String convenio="CONVENIO:RIMAC CO-PAGO 10%";
String nombre="Nombre:Maria Fernadez";
String dni="DNI:41754214";
String ventaTotal="MONTO TOTALES: S/ 2040.37";
String institucion="INSTITUCION-90%";
String docRef="DOC. REF.(10%):B001-00000001-S/204.03";
String codPago="Condicion Pago:Credito a  45 dias";


    public boolean imprimir(){
       //epson 1020
      String barCodeData = "20305354563|01|F001|356|48.1|315.32|2014-09-29|6|20369796314|+dYjsUQtDp6f3AIUYuJVeZVqpCk=|k7DaGyFJT+e/dc9AabzIn7IO6wuBllzszSJkhXSVOjRwwCBj/2erGUO5PyIsUoEuu/hB9xQGL5gVBT1o6KsRtWeS4b2mRoMM5C0a+QKRG2j2WvikFZ9mu73yf77O15xOUOtDytXoAxvtGg6zgROsc4EvfEE5h9nsX6DVn+JBckyaWGYHG9UPxU+SZ0sZPZcYtMxaraJvafgqFvARhGzyqii86PSX0bXRPJTEDI4gTp4++KNhOz78nncXPi3zXJqP9N2xlhkDWQtBq/6dcLE29IRW5Ix77gvJxcugDNc9bmKlLR9AmyKXnQ9fNneAVyhyeA5GMatx3bQ8sWKtCqyikg==|+dYjsUQtDp6f3AIUYuJVeZVqpCk=" ;
 //String barCodeData="20512002090|00|BB99|314|6.06|39.7|2014-09-01|0|0|bkP/kyrk3CyaRaFgimgmVVqFNMY=|hTLvRQL/u4RFHjRrgpAmubGaGzOnl6igILvSJ2Z2feOPr2QWYv6lwuyr0j0m3I071klxgbW+pFkNjdgqGJRyiiA4gdQUKl0lkJg7T409jhd3CI2I63RZglt+x5uBNFl7hibIwNtpISFTxqfQY8SQNFPxeD8aip6JLcbgbiYM6dwIsJjGNEpi6rrmORDcJQHhMQHoETLHCKZtHLWPR7iFTEn+LsnZu8s2YBx97oOnK+Op2jty1fZdNql3ebheOHd6YSU74jpRLr3ApdRyvzEGfBkWXmbMkL+CpQ2BTPcptvZsr9qKu+NqB05XTsHLqAqmJmVumOmohxbC6xn/8FfrBg==|bkP/kyrk3CyaRaFgimgmVVqFNMY=20512002090|00|BB99|314|6.06|39.7|2014-09-01|0|0|bkP/kyrk3CyaRaFgimgmVVqFNMY=|hTLvRQL/u4RFHjRrgpAmubGaGzOnl6igILvSJ2Z2feOPr2QWYv6lwuyr0j0m3I071klxgbW+pFkNjdgqGJRyiiA4gdQUKl0lkJg7T409jhd3CI2I63RZglt+x5uBNFl7hibIwNtpISFTxqfQY8SQNFPxeD8aip6JLcbgbiYM6dwIsJjGNEpi6rrmORDcJQHhMQHoETLHCKZtHLWPR7iFTEn+LsnZu8s2YBx97oOnK+Op2jty1fZdNql3ebheOHd6YSU74jpRLr3ApdRyvzEGfBkWXmbMkL+CpQ2BTPcptvZsr9qKu+NqB05XTsHLqAqmJmVumOmohxbC6xn/8FfrBg==|bkP/kyrk3CyaRaFgimgmVVqFNMY=\n==|bkP/kyrk3CyaRaFgimgmVVqFNMY=\n==|bkP/kyrk3CyaRaFgimgmVVqFNMY=\n==|bkP/kyrk3CyaRaFgimgmVVqFNMY=\n==Cya" ;
               //20512002090|00|BB99|314|6.06|39.7|2014-09-01|0|0|bkP/kyrk3CyaRaFgimgmVVqFNMY=|hTLvRQL/u4RFHjRrgpAmubGaGzOnl6igILvSJ2Z2feOPr2QWYv6lwuyr0j0m3I071klxgbW+pFkNjdgqGJRyiiA4gdQUKl0lkJg7T409jhd3CI2I63RZglt+x5uBNFl7hibIwNtpISFTxqfQY8SQNFPxeD8aip6JLcbgbiYM6dwIsJjGNEpi6rrmORDcJQHhMQHoETLHCKZtHLWPR7iFTEn+LsnZu8s2YBx97oOnK+Op2jty1fZdNql3ebheOHd6YSU74jpRLr3ApdRyvzEGfBkWXmbMkL+CpQ2BTPcptvZsr9qKu+NqB05XTsHLqAqmJmVumOmohxbC6xn/8FfrBg==|bkP/kyrk3CyaRaFgimgmVVqFNMY=
       String epson="EPSON";
       String star="START";
       String ruta="\\"+"\\10.18.1.222\\TICKET";
       String ruta2="\\"+"\\10.18.1.226\\EPSONT2";
       FarmaPrinterFacade printer=new FarmaPrinterFacade(epson,ruta2);//manda imprimir segun el modelo de impresora
       if(!printer.startPrintService()){
          return false;
    
     }else{
     
      printer.inicializate();//INICIALIZAR LA IMPRESORA--VALORES POR DEFECTO
     // printer.printLineDoubleSize("FASA");
    
      printer.printCodePDF417(barCodeData);
     /* printer.printLineCenter(emisor);//CENTRAR TEXTO
      printer.printLineCenter(razonSocial+printer.printEspacioBlanco(1)+rucemisor);
      printer.printLine(direccion+""+lima);
      printer.printLineCenter(telefono);
      printer.printLine(direcLocal);
      printer.printLineCenter(nomDocElec);
      printer.printLineCenter(numDocElec);
      printer.printLine(fecEmision);
      printer.printLine(ordeCompra+printer.printEspacioBlanco(1)+numGuiaRemision);
      printer.printLineDotted(30);//IMPRIME LINEA PUNTEADA
      printer.printLineBold("Codigo  \t"+"Descripción  \t"+"     Cant \t"+"    P.U\t"+" Importe");//IMPRIME NEGRITA
      printer.printLineDotted(30);
      printer.printLine(printer.ajusteAutomatico("137090", "ROXTIL CREMA TBO 100", "2", "10.20", "17.29"));
      printer.printLine(printer.ajusteAutomatico("137090", "ROXTRIM BALSAMICOS", "2", "9.60", "16.27"));
      printer.printLine(printer.ajusteAutomatico("133391", "DIAGLINEX 500Mg/m ", "100/100", "112.80", "107.16"));
      printer.printLine(printer.ajusteAutomatico("133432", "BONIF.PLENITUF PAN ", "2", "25.90", "00.00"));
      printer.printLine(printer.ajusteAutomatico("141011", "LISTERINE CITRUS FC", "2", "1000.50", "1005.00"));
      printer.printLineDotted(30);
      printer.printLineRigth(gravadas+printer.ajusteAutomatico("33.56"));//ALIENA A LA DERECHA
      printer.printLineRigth(inafectas+printer.ajusteAutomatico("107.16"));
      printer.printLineRigth(exoneradas+printer.ajusteAutomatico("2001.00"));
      printer.printLineRigth(gratuitas+printer.ajusteAutomatico("51.80"));
      printer.printLineRigth(igv+printer.ajusteAutomatico("6.04"));
      printer.printLineRigth(descuento+printer.ajusteAutomatico("107.39"));
      printer.printLineRigth(total+printer.ajusteAutomatico("2147.76"));
      printer.printLineDotted(30);
      printer.printLineRigth(printer.printEspacioBlanco(10)+efecSoles+printer.ajusteAutomatico("2500.00"));
      printer.printLineRigth(printer.printEspacioBlanco(10)+vuelto+printer.ajusteAutomatico("459.63"));
      printer.printLine(rucCliente);
      printer.printLine(razSocial);
      printer.printLine(convenio);
      printer.printLine(nombre);
      printer.printLine(dni);
      printer.printLine(institucion); 
      printer.printLine(docRef);
      printer.printLine(vuelto);
      printer.printLine(codPago);
     // printer.printCodePDF417(barCodeData);//IMPRIME EL CODIGO DE BARRA PDF417
      printer.printLine("Guarda tu voucher");
      printer.printLine("Es el sustento para validar tu compra");
      printer.printLine("Representacion impresa dela factura comprobante");
      printer.printLine("electronico, este puede ser consultada en");
      printer.printLine("www.mifarma.com.pe");
      printer.printLine("Autorizando mendiante resolucion de intendencia");
      printer.printLine("0189050000833/SUNAT");
      printer.printLine("CJ:GGAMBARINI");
      printer.printLine("No se aceptan devoluciones de dinero.");
      printer.printLine("Cambio de mercaderia unicamente dentro");
      printer.printLine("de las 48 horas siguientes ala compra.");
      printer.printLine("Indispensable presentar comprobante.");
      printer.printLineDotted(30);
      printer.printLine("DELIVERY 619-0000 LAS 24 HORAS");
      printer.printLine("V2.4.0");*/
      printer.endPrintService();
      return true;
       }
    }
    public static void main(String args[]){
        ImprimeTicket ticket=new ImprimeTicket();
        ticket.imprimir();
    }
        
    }
 

