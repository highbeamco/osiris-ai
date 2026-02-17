terraform {
  required_providers {
    google = {
      source = "hashicorp/google"
      version = "7.17.0" # https://github.com/hashicorp/terraform-provider-google/releases
    }
  }
  backend "gcs" {
    bucket = "highbeam-osiris-infrastructure"
  }
}

provider "google" {
}
