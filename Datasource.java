import java.sql.*;

public class Datasource {

    public static Connection connect(){
        Connection connection = null;
        String sql = "jdbc:mySQL://localhost:3306/ivf_inventory_2023";

        try{
            connection = DriverManager.getConnection(sql,"devUser", "Skittlesquad@@77");
            System.out.println("We are connected");

//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("Select * FROM Plastics");
//
//            while(resultSet.next()){
//                System.out.println(resultSet.getString("name") + ", " + resultSet.getString("reference_number") +
//                                   ", " + resultSet.getString("lot_number") + ", " + resultSet.getString("balance"));
//            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
    public static Plastic getPlastic(String name){
        String sql = "Select * From Plastics Where name = ?";
        Plastic plastic = null;

        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql)){

                statement.setString(1, name);
                try(ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        plastic = new Plastic(
                                resultSet.getString("name"),
                                resultSet.getInt("reference_number"),
                                resultSet.getString("lot_number"),
                                resultSet.getInt("balance")
                        );
                    }
                }
        }catch(SQLException e){
            e.printStackTrace();
        }
    return plastic;
    }

    public static Media getMedia(String name){
        String sql = "Select * FROM Media Where name =?";
        Media media = null;

        try(Connection connection = connect();
            PreparedStatement statement = connection.prepareStatement(sql)){
                 statement.setString(1, name);

                 try(ResultSet resultSet = statement.executeQuery()) {
                     while (resultSet.next()) {
                         media = new Media(
                                 resultSet.getString("name"),
                                 resultSet.getInt("reference_number"),
                                 resultSet.getString("lot_number"),
                                 resultSet.getInt("balance")
                         );
                     }
                 }

        }catch(SQLException e ){
            e.printStackTrace();
        }
        return media;
    }

    public static void updatePlastics(String name, int balance){
            String sql = "Update Plastics set balance = ? Where name =?";
            Plastic plastic = null;
            Connection connection = connect();

            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                    statement.setInt(1, balance);
                    statement.setString(2, name);
                    statement.executeUpdate();
                System.out.println("The IVF Inventory for " + name + " has been UPDATED to the new balance of: " + balance);

            }catch (SQLException e){
                e.printStackTrace();
            }
    }
    public static void updateMedia(String name, int balance){
        String sql = "Update Media set balance = ? Where name =?";
        Media media = null;
        Connection connection = connect();

        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, balance);
            statement.setString(2, name);
            statement.executeUpdate();
            System.out.println("The IVF Inventory for " + name + " has been UPDATED to the new balance of: " + balance);

        }catch (SQLException e ){
            e.printStackTrace();
        }
    }
    public static void printPlasticInventory() {

        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * FROM Plastics");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + ", " + resultSet.getString("reference_number") +
                        ", " + resultSet.getString("lot_number") + ", " + resultSet.getString("balance"));
            }

        }catch(SQLException e ){
            e.printStackTrace();
        }
    }
    public static void printMediaInventory() {

        try (Connection connection = connect()) {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * FROM Media");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + ", " + resultSet.getString("reference_number") +
                        ", " + resultSet.getString("lot_number") + ", " + resultSet.getString("balance"));
            }

        }catch(SQLException e ){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
//       Plastic plastic = getPlastic("Organ Wells");
//       System.out.println("The balance for Organ Wells is: " + plastic.getLot_number());
//
//        Media media = getMedia("pvp");
//        System.out.println("The balance for PVP is: " + media.getBalance());
//
//        System.out.println("=====================================");
//        printPlasticInventory();
//        System.out.println("=====================================");
//        printMediaInventory();
//        System.out.println("=====================================");
    }



}
