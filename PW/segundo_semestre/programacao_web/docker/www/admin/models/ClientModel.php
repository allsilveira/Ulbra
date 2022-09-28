<?
  class ClientModel {
    public function listClients()
    {
      require_once('db/ConnectClass.php');
      $ConnectClass = new ConnectClass();
      $ConnectClass -> openConnect();
      $connection = $ConnectClass -> getConn();

      $sql = "SELECT * FROM clients";
      return $connection -> query($sql);
    }

    public function detailsClient($idClient)
    {
      require_once('db/ConnectClass.php');
      $ConnectClass = new ConnectClass();
      $ConnectClass -> openConnect();
      $connection = $ConnectClass -> getConn();

      $sql = "SELECT * FROM clients WHERE id = $idClient";
      return $connection -> query($sql);
    }
  }
