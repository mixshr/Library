public class Test {
    public static void main(String[] args) {
        UserAdministrator userAdministrator = new UserAdministrator("Олег");
        SupplierReader supplierReader = new SupplierReader("Катя");
        LibrarianAdministrator librarianAdministrator = new LibrarianAdministrator("Вася");

        userAdministrator.overdueNotification(supplierReader);
        supplierReader.takeBook(userAdministrator);
        supplierReader.returnBook(userAdministrator);
        librarianAdministrator.orderBook(supplierReader);
    }
}