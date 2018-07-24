package services

import org.nsjames.services.EOSApis
import scala.concurrent.ExecutionContext.Implicits._
import scala.util.{Failure, Success}

object CreateWallet extends App {
  //     The name of the wallet should be numeric only. I can't figure out why, If you give a non-numeric
  //     name to it, it will give an internal server error.
  val walletName = Math.abs(scala.util.Random.nextInt())
  Console.out.println(s"Trying to create wallet: $walletName")
  val possibleWallet = EOSApis.wallet.create(walletName.toString)
  possibleWallet.onComplete {
    case Failure(ex) => ex.printStackTrace()
    case Success(password) => Console.out.println(s"The master password of the wallet is:::: $password")
  }
}
