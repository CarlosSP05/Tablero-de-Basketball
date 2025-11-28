# Tablero de Marcador de Baloncesto

Este proyecto es una aplicación para gestionar el marcador de un partido de baloncesto, permitiendo sumar y restar puntos a los equipos, ver el puntaje en tiempo real, y pasar a una segunda pantalla con el resultado final.

## Descripción

La aplicación consta de dos actividades principales:

- **MainActivity**: Muestra el marcador de los dos equipos (local y visitante) y permite añadir o restar puntos mediante botones. También ofrece un botón para resetear el marcador.
- **ScoreActivity**: Muestra el marcador final y el equipo ganador (o si es empate).

### Funciones principales

- Sumar puntos al equipo local o visitante (+1, +2).
- Restar puntos al equipo local o visitante (-1).
- Resetear el marcador de ambos equipos.
- Mostrar el marcador final y el ganador en una segunda actividad.

## Tecnologías utilizadas

- **Android Studio**: IDE utilizado para desarrollar la aplicación.
- **Java**: Lenguaje de programación utilizado para la lógica de la aplicación.
- **Data Binding**: Utilizado para enlazar los datos con la interfaz de usuario de manera eficiente.
- **Material Design**: Para los componentes de la interfaz de usuario.

## Requisitos

- Android Studio.
- SDK de Android con soporte para Android 24 (mínimo).
- Habilitar **Data Binding** en el proyecto.

## Instalación

1. **Clonar el repositorio**:

    ```bash
    git clone https://github.com/tu_usuario/tablero_basket.git
    ```

2. **Abrir el proyecto en Android Studio**.

3. **Sincronizar el proyecto**:
    - Haz clic en **File > Sync Project with Gradle Files** para asegurarte de que todo esté configurado correctamente.

4. **Construir el proyecto**:
    - Ve a **Build > Rebuild Project** para construir el proyecto.

5. **Ejecutar la aplicación**:
    - Conecta tu dispositivo Android o usa un emulador.
    - Haz clic en **Run > Run 'app'** para ejecutar la aplicación.

## Uso

- En **MainActivity**, puedes agregar puntos al equipo local o visitante utilizando los botones `+1`, `+2` y `-1`. 
- También puedes resetear el marcador con el botón de **Reset**.
- Cuando termines el partido, haz clic en el botón **"Mostrar Resultados"** para ir a la pantalla de resultados y ver quién ganó.

## Estructura del Proyecto

- **MainActivity.java**: Contiene la lógica para actualizar los puntajes, resetear el marcador y navegar entre actividades.
- **ScoreActivity.java**: Muestra el marcador final y el ganador.
- **activity_main.xml**: Layout de la actividad principal, con botones y `TextView` para los puntajes.
- **activity_score.xml**: Layout de la actividad de resultados, que muestra el puntaje final y el ganador.

## Capturas de pantalla

-

<img width="365" height="777" alt="image" src="https://github.com/user-attachments/assets/cd12cf6f-d08c-4697-9b3a-7ce1e3f780cb" />

-

<img width="376" height="493" alt="image" src="https://github.com/user-attachments/assets/945f3446-6dd3-457b-a35c-9dbf6970bbc3" />

-

<img width="359" height="410" alt="image" src="https://github.com/user-attachments/assets/e7e96dad-14cd-4913-a844-d9e0837f4b46" />





