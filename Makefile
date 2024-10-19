DOCKER_COMPOSE_FILE=docker-compose.yaml

.PHONY: up stop prune

up:
	docker-compose -f $(DOCKER_COMPOSE_FILE) up --build

stop:
	docker-compose -f $(DOCKER_COMPOSE_FILE) down

prune:
	docker-compose -f $(DOCKER_COMPOSE_FILE) down -v
# docker system prune -f
