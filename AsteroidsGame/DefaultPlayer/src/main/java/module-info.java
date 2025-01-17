import dk.sdu.student.njako21.common.services.IBulletCreator;
import dk.sdu.student.njako21.common.services.IEntityProcessingService;
import dk.sdu.student.njako21.common.services.IGamePluginService;

module DefaultPlayer {
    requires Common;

    uses IBulletCreator;

    provides IGamePluginService with dk.sdu.student.njako21.defaultplayer.PlayerPlugin;
    provides IEntityProcessingService with dk.sdu.student.njako21.defaultplayer.PlayerControlSystem;
}