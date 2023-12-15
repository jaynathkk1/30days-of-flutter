import cv2

video_cap = cv2.VideoCapture(0)
while True :
    ret , Video_data = video_cap.read()
    cv2.imshow("vidio_live",Video_data)
    if cv2.waitKey(10) == ord("a"):
        break
video_cap.release()
