package location.repository

import location.model.GameLocation

/**
 * Хранилище инофрмации об игровых локациях
 */

class GameLocationRepository {
    val locations = ArrayList<GameLocation>()

    init {
        locations.add(GameLocation("Комната отеля"))
    }
}
