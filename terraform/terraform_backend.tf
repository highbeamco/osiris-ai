resource "google_storage_bucket" "infrastructure" {
  project = var.project
  name = "highbeam-osiris-infrastructure"
  location = "US"
}
