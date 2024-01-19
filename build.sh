#                    docker build --network host --pull --tag $BUILD_IMAGE_NAME build_image
#                    docker tag $BUILD_IMAGE_NAME "$DOCKER_REPO/transportation/$BUILD_IMAGE_NAME:$VERSION"
#                    docker push "$DOCKER_REPO/transportation/$BUILD_IMAGE_NAME:$VERSION"
#                    docker tag $BUILD_IMAGE_NAME "$DOCKER_REPO/transportation/$BUILD_IMAGE_NAME:latest"
#                    docker push "$DOCKER_REPO/transportation/$BUILD_IMAGE_NAME:latest"

#docker build -t vlad-test .
#docker tag vlad-test registry.metroscales.io/transportation/vlad-test:v4
#docker push registry.metroscales.io/transportation/vlad-test:v2