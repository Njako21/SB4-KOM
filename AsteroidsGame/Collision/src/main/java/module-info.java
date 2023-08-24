import dk.sdu.student.njako21.common.services.IPostEntityProcessingService;

module Collision {
    requires Common;

    provides IPostEntityProcessingService with dk.sdu.student.njako21.collision.CollisionDetector;
}