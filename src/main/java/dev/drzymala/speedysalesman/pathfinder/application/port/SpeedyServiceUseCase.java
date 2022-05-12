package dev.drzymala.speedysalesman.pathfinder.application.port;

import dev.drzymala.speedysalesman.commons.Either;

import java.util.List;

public interface SpeedyServiceUseCase<T> {

    FindPathResponse findPath(String data);

    List<T> generate(int size);

    class FindPathResponse<T> extends Either<String, List<T>> {

        long totalTimeMili;

        public FindPathResponse(boolean success, String left, List<T> right, long totalTimeMili) {
            super(success, left, right);
            this.totalTimeMili = totalTimeMili;
        }

        public static FindPathResponse success(List list, long totalTimeMili) {

            return new FindPathResponse(true, null, list, totalTimeMili);
        }

        public static FindPathResponse failure(String error) {

            return new FindPathResponse(false, error, null, 0L);
        }

        @Override
        public String toString() {
            return super.getRight() + "\n" + totalTimeMili + " miliseconds";
        }
    }
}
