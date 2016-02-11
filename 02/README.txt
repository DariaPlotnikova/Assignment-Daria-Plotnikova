After installing Docker on PC follow to that steps to run Hello-Docker app:

1) build an image from Dockerfile:
	docker build -t dariaplotnikovad/hellodocker .
2) run container from created image:
	docker run -d -p 8080:8080 dariaplotnikovad/hellodocker
3) request to server:
	curl localhost:8080	(in Terminal)    or
	localhost:8080		(in Browser)
