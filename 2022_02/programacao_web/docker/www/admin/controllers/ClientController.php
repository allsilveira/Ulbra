<?php

class ClientController
{
  var $ClientModel;

  public function __construct()
  {
    require_once('models/ClientModel.php');
    $this->ClientModel = new ClientModel();
  }

  public function listClients()
  {
    $result = $this->ClientModel->listClients();

    $arrayClients = array();
    while ($line = $result->fetch_assoc()) {
      array_push($arrayClients, $line);
    }

    require_once('views/templates/header.php');
    require_once('views/clients/listClients.php');
    require_once('views/templates/footer.php');
  }

  public function detailsClient($idClient)
  {
    $result = $this->ClientModel->consultClient($idClient);

    if($line = $result->fetch_assoc()) {
      require_once('views/templates/header.php');
      require_once('views/clients/detailsClient.php');
      require_once('views/templates/footer.php');
    }
  }

  public function newClient()
  {
    require_once('views/templates/header.php');
    require_once('views/clients/newClient.php');
    require_once('views/templates/footer.php');
  }

  public function insertClient()
  {
    $arrayClient = [
      'name' => $_POST['name'],
      'email' => $_POST['email'],
      'phone' => $_POST['phone'],
      'address' => $_POST['address'],
    ];

    $this->ClientModel->insertClient($arrayClient);

    header('Location:?controller=client&action=listClients');
  }

  public function updateClient($idClient)
  {
    $result = $this->ClientModel->consultClient($idClient);

    if($line = $result->fetch_assoc()) {
      require_once('views/templates/header.php');
      require_once('views/clients/updateClient.php');
      require_once('views/templates/footer.php');
    }
  }

  public function updateClientAction($idClient)
  {
    $arrayClient = [
      'idClient' => $idClient,
      'name' => $_POST['name'],
      'email' => $_POST['email'],
      'phone' => $_POST['phone'],
      'address' => $_POST['address'],
    ];

    $this->ClientModel->updateClient($arrayClient);

    header('Location:?controller=client&action=listClients'); 
  }

  public function deleteClient($idClient)
  {
    $this->ClientModel->deleteClient($idClient);

    header('Location:?controller=client&action=listClients');
  }
}
