cmake_minimum_required(VERSION 3.12)
project(p01 C CXX)

set(CMAKE_C_STANDARD 90)
set(CMAKE_CXX_STANDARD 20)

add_executable(${PROJECT_NAME}_c_main main.c)
