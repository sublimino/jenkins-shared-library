// vars/cp.groovy
// TODO untested
def call(Map pipelineParams) {
  println """
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▄░░░░░░░░░█▄░░░░░░░░░░░░░░░░░░░░░░░
░░░░▄░░░░░░▄░░░░▄▄░░░░░░█▄ ░░░▄░░▄░░░░▄░░░░██░░░▄▄░░░░██░░░▄▄▄░░▄▄░░░░░░░░▄░░░░
░░██▀█▄░░██▀█▄░░██▀██▄░████▄░░███▀░░██▀█▄░░██░░████▄░░██░░▀▀▀██░██▀██▄░▄████▄░░
░██░░░░░██░░░██░██░░██░░██ ░░░██░░░██░░░██░██░░██░░██░██░▄█████░██░░██░██▄▄▄█░░
░░██░▄█░░██░██░░██░░██░░██░▄░░██░░░░██░██░░██░░████▀░░██░██░░██░██░░██░██▄░▄▄░░
░░░▀█▀░░░░▀█▀░░░██░░██░░░██▀░░█▀░░░░░▀█▀░░░██░░██░░░░░██░░▀███▀░██░░██░░▀██▀░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░@controlplaneio░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░info@control-plane.io░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░https://control-plane.io░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
"""

//  sh "env | base64"

  println """
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█▄░░░░░░░░░█▄░░░░░░░░░░░░░░░░░░░░░░░
░░░░▄░░░░░░▄░░░░▄▄░░░░░░█▄ ░░░▄░░▄░░░░▄░░░░██░░░▄▄░░░░██░░░▄▄▄░░▄▄░░░░░░░░▄░░░░
░░██▀█▄░░██▀█▄░░██▀██▄░████▄░░███▀░░██▀█▄░░██░░████▄░░██░░▀▀▀██░██▀██▄░▄████▄░░
░██░░░░░██░░░██░██░░██░░██ ░░░██░░░██░░░██░██░░██░░██░██░▄█████░██░░██░██▄▄▄█░░
░░██░▄█░░██░██░░██░░██░░██░▄░░██░░░░██░██░░██░░████▀░░██░██░░██░██░░██░██▄░▄▄░░
░░░▀█▀░░░░▀█▀░░░██░░██░░░██▀░░█▀░░░░░▀█▀░░░██░░██░░░░░██░░▀███▀░██░░██░░▀██▀░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░@controlplaneio░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░info@control-plane.io░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░https://control-plane.io░
░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░
"""
}
