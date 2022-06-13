<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="../assets/libs/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="../assets/css/style.css">
    <title>Healthtrack</title>
  </head>
  <body>
    <div class="container">
        <div class="row justify-content-center mt-3">
            <div class="col-md-6 col-xs-12 mb-3 text-center main-circle">
                <h3 class="pt-4">Cal<br>
                    <span class="text-warning">1500</span>/<span class="text-success">2000</span>
                </h2>
            </div>
        </div>
        <div class="row w-100 justify-content-center mb-5 m-0">
            <div class="col-md-4 col-xs-4 mb-3 text-center mx-2 sub-circle">
                <h4 class="pt-3">
                    <i class="fa-solid fa-person-running"></i><br>
                    758<br>
                    Passos
                </h4>
            </div>

            <div class="col-md-4 col-xs-4 mb-3 text-center sub-circle">
                <h4 class="pt-3">
                    <i class="fa-solid fa-heart-pulse"></i><br>
                    95<br>
                    bpm
                </h4>
            </div>
        </div>
        <div class="row justify-content-md-center">
            <div class="col-md-6 col-xs-4">
                <div class="card bg-dark text-white mb-3 item-home py-1">
                    <div class="card-body">
                        <div class="col-xs-12"><i class="fa fa-clock"></i> 08:00 - Café da Manhã</div>
                    </div>
                </div>
                <div class="card bg-dark text-white mb-3 item-home py-1">
                    <div class="card-body row">
                        <div class="col-xs-12"><i class="fa fa-clock"></i> 11:00 - Academia</div>
                    </div>
                </div>
                <div class="card bg-dark text-white mb-3 item-home py-1">
                    <div class="card-body">
                        <div class="col-xs-12"><i class="fa-solid fa-scale-unbalanced"></i> 80/68 - Peso</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="row justify-content-md-center menu-bottom">
            <div class="col-md-6">
                <div class="row bg-dark mb-3 card-list d-flex align-items-end">
                    <div class="col text-center py-4">
                        <a class="text-white" href="home.html">
                            <i class="fa fa-home fa-2xl"></i>
                        </a>
                    </div>
                    <div class="col text-center text-center py-4">
                        <a class="text-white" href="list-meals.html">
                            <i class="fa-solid fa-drumstick-bite fa-2xl"></i>
                        </a>
                    </div>
                    <div class="col text-center text-center py-4">
                        <a class="text-white" href="#">
                            <i class="fa-solid fa-dumbbell fa-2xl"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
</html>