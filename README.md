<div align="center">
  <img src="https://img.shields.io/badge/Java 17-000000?style=for-the-badge&logo=openjdk&logoColor=white">
  <img src="https://img.shields.io/badge/D3-F9A03C?style=for-the-badge&logo=D3&logoColor=white">
  <img src="https://img.shields.io/badge/Apache FreeMarker-326CAC?style=for-the-badge&logo=apachefreemarker&logoColor=white">
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white">
  <img src="https://img.shields.io/badge/LaTeX-008080?style=for-the-badge&logo=latex&logoColor=white">
  <img src="https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white">

</div>

<br />

<p align="center">
  <img src="assets/icon.png" alt="Logo" width="120" height="120" style="border-radius:15%;">
  <h3 align="center">Multimodal Parliament Explorer</h3>
  <p align="center">Abschlussprojekt des Programmierpraktikums.</p>
</p>
<div align="center" style="display: flex; flex-direction: column; gap: 0.5em;">
  <a href="https://documentation.multimodalparliamentexplorer.landmann.ph/">
    <img alt="JavaDoc öffnen" src="https://img.shields.io/badge/JavaDoc öffnen-F89820?style=for-the-badge&logo=openjdk&logoColor=white">
  </a>
  <a href="benutzerhandbuch.md">
    <img alt="Zum Benutzerhandbuch" src="https://img.shields.io/badge/Zum Benutzerhandbuch-000000?style=for-the-badge&logo=data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGhlaWdodD0iMjRweCIgdmlld0JveD0iMCAtOTYwIDk2MCA5NjAiIHdpZHRoPSIyNHB4IiBmaWxsPSIjZTNlM2UzIj48cGF0aCBkPSJNMjQwLTgwcS0zMyAwLTU2LjUtMjMuNVQxNjAtMTYwdi02NDBxMC0zMyAyMy41LTU2LjVUMjQwLTg4MGg0ODBxMzMgMCA1Ni41IDIzLjVUODAwLTgwMHY2NDBxMCAzMy0yMy41IDU2LjVUNzIwLTgwSDI0MFptMC04MGg0ODB2LTY0MGgtODB2MjgwbC0xMDAtNjAtMTAwIDYwdi0yODBIMjQwdjY0MFptMCAwdi02NDAgNjQwWm0yMDAtMzYwIDEwMC02MCAxMDAgNjAtMTAwLTYwLTEwMCA2MFoiLz48L3N2Zz4=&logoColor=white">
  </a>
</div>

## Dependencies

* Git
* Docker

## Anleitung zur Benutzung (mit Docker)

1. Repository klonen: `git clone https://github.com/kuuhhl/multimodal_parliament_explorer`
2. Hinein-Navigieren: `cd multimodal_parliament_explorer`
3. Docker-Image erstellen: `docker build -t multimodal_parliament_explorer .`
4. Docker-Container starten: `docker run --rm -d -p 7001:7001 multimodal_parliament_explorer`
5. Im Browser öffnen: [http://localhost:7001](http://localhost:7001)

> Für eine ausführlichere Anleitung geht es [hier](benutzerhandbuch.md) zum Benutzerhandbuch.

## Screenshots

<div align="center">
  <img src="assets/screenshot-1.png" alt="Screenshot 1" width="300" style="margin-right: 20px;">
  <img src="assets/screenshot-2.png" alt="Screenshot 2" width="300" style="margin-left: 20px;">
</div>

## Features

* Anzeigen von Parlamentsreden mitsamt Video
* Informationen zu Rednern und Protokollen
* Visualisierung von NLP-Analysen mithilfe von Diagrammen
* Export als XML / PDF
