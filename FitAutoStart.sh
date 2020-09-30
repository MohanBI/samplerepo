#!/bin/sh
tmux new-session -s FitnesseQA -n script -d
tmux send-keys -t FitnesseQA "sh /home/startFitnesse.sh" C -m