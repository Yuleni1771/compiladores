class Prisma {
  double ancho;
  double alto;
  double profundidad;
  public Prisma(double ancho, double alto, double profundidad) {
    ancho = ancho;
    alto = alto;
    profundidad = profundidad;
  }
  double volumen() {
    return ancho * alto * profundidad;
  }
}

class PrismaDemo3 {
  public static void main(String[] args) {
    Prisma miPrisma1 = new Prisma(10,20,15);
    Prisma miPrisma2 = new Prisma(3,6,8);
    double vol;
    vol = miPrisma1.volumen();
    System.out.println("El volumen es " + vol);
    vol = miPrisma2.volumen();
    System.out.println("El volumen es " + vol);
  }
}
/* El volumen es 0.0
   El volumen es 0.0  */
